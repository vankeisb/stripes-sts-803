package test.webapp.stripes;

import net.sourceforge.stripes.action.*;

@UrlBinding("/index")
public class IndexActionBean implements ActionBean {

    private ActionBeanContext context;

    public ActionBeanContext getContext() {
        return context;
    }

    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    public Resolution index() {
        return new ForwardResolution("/WEB-INF/jsp/index.jsp");
    }
}