package controllers;

import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static void contact() {
        render("Application/contact.html");
    }
    public static void about() {
        render("Application/about.html");
    }
    public static void service() {
        render("Application/service.html");
    }
}