package smartfoodcluster.feedme.util;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import smartfoodcluster.feedme.entities.Menu;
import smartfoodcluster.feedme.entities.Order;
import smartfoodcluster.feedme.entities.Restaurant;
import smartfoodcluster.feedme.entities.User;
import smartfoodcluster.feedme.entities.Weave;

/**
 * Objectify service wrapper so we can statically register our persistence classes
 * More on Objectify here : https://code.google.com/p/objectify-appengine/
 */
public class OfyService {

    static {
        ObjectifyService.register(User.class);
        ObjectifyService.register(Order.class);
        ObjectifyService.register(Menu.class);
        ObjectifyService.register(Restaurant.class);
        ObjectifyService.register(Weave.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}