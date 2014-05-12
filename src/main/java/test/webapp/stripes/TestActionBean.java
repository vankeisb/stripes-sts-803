package test.webapp.stripes;

import net.sourceforge.stripes.action.*;

@UrlBinding("/test/{param1}/{$event}")
public class TestActionBean implements ActionBean {

    private ActionBeanContext context;

    public ActionBeanContext getContext() {
        return context;
    }

    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    @DefaultHandler
    public Resolution index() {
        return new ForwardResolution("/WEB-INF/jsp/index.jsp");
    }
}