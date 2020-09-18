module MeteoJava {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens kapela;
    opens kapela.view;
    opens kapela.controller;
    opens kapela.model;
}