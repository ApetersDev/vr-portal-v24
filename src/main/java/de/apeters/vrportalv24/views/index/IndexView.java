package de.apeters.vrportalv24.views.index;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("Index")
@Menu(icon = "line-awesome/svg/pencil-ruler-solid.svg", order = 0)
@Route("")
@AnonymousAllowed
public class IndexView extends Composite<VerticalLayout> {

    public IndexView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
