<%@ taglib uri="http://stripes.sourceforge.net/stripes.tld" prefix="s" %>
<!DOCTYPE html>
<html>
<body>
<s:form beanclass="test.webapp.stripes.TestActionBean" id="testForm">
    <h3>Testing a form</h3>
    <s:link beanclass="test.webapp.stripes.TestActionBean">
        <s:param name="param1" value="testing"/>
    </s:link>
</s:form>
</body>
</html>