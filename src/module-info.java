module MeteoJava {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires org.json;

    opens kapela;
    opens kapela.view;
    opens kapela.controller;
    opens kapela.model;
}