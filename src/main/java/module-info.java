module swmfx {

    requires transitive javafx.controls;
    requires javafxsvg;
    requires java.xml;
    requires jdk.xml.dom;

    exports io.gofannon.swm;
    opens images;

}