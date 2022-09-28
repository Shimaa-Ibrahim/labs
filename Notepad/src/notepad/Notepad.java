/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class Notepad extends Application {

    Menu file;
    MenuItem newItem;
    MenuItem openItem;
    MenuItem saveItem;
    MenuItem exitItem;
    Menu edit;
    MenuItem undoItem;
    MenuItem cutItem;
    MenuItem copyItem;
    MenuItem pasteItem;
    MenuItem deleteItem;
    MenuItem selectAllItem;
    Menu help;
    Scene scene;
    TextArea textArea;
    String strCop;
    File newFile;
    MenuItem aboutItem;

    @Override
    public void init() {
        MenuBar bar = new MenuBar();

        // file menu
        file = new Menu("File");
        newItem = new MenuItem("New");
        newItem.setAccelerator(KeyCombination.keyCombination("Ctrl+a"));
        openItem = new MenuItem("Open...");
        openItem.setAccelerator(KeyCombination.keyCombination("Ctrl+b"));
        saveItem = new MenuItem("Save");
        saveItem.setAccelerator(KeyCombination.keyCombination("Ctrl+c"));
        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        exitItem = new MenuItem("Exit");
        exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+d"));
        file.getItems().addAll(newItem, openItem, saveItem, separatorMenuItem, exitItem);

        //Edit menu
        edit = new Menu("Edit");
        undoItem = new MenuItem("Undo");
        undoItem.setAccelerator(KeyCombination.keyCombination("Ctrl+e"));
        SeparatorMenuItem separatorMenuItem1 = new SeparatorMenuItem();
        cutItem = new MenuItem("Cut");
        cutItem.setAccelerator(KeyCombination.keyCombination("Ctrl+f"));
        copyItem = new MenuItem("Copy");
        copyItem.setAccelerator(KeyCombination.keyCombination("Ctrl+g"));
        pasteItem = new MenuItem("Paste");
        pasteItem.setAccelerator(KeyCombination.keyCombination("Ctrl+h"));
        deleteItem = new MenuItem("Delete");
        deleteItem.setAccelerator(KeyCombination.keyCombination("Ctrl+h"));
        SeparatorMenuItem separatorMenuItem2 = new SeparatorMenuItem();
        selectAllItem = new MenuItem("Select All");
        selectAllItem.setAccelerator(KeyCombination.keyCombination("Ctrl+i"));

        edit.getItems().addAll(undoItem, separatorMenuItem1, cutItem, copyItem, pasteItem, deleteItem, separatorMenuItem2, selectAllItem);

        //help menu
        help = new Menu("Help");
        aboutItem = new MenuItem("About Notepad");
        help.getItems().addAll(aboutItem);

        bar.getMenus().addAll(file, edit, help);
        BorderPane menuPane = new BorderPane();
        menuPane.setTop(bar);

        //text Area
        textArea = new TextArea();
        BorderPane textPane = new BorderPane();
        textPane.setCenter(textArea);

        BorderPane notePad = new BorderPane();
        notePad.setTop(menuPane);
        notePad.setCenter(textPane);
        scene = new Scene(notePad, 300, 250);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Notepad!");
        primaryStage.setScene(scene);
        primaryStage.show();

        newItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textArea.clear();
            }

        });

        saveItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileWriter newFile;
                try {
                   //FileChooser f = new FileChooser();
                   //f.setTitle("As");
                   //File file = f.showSaveDialog(null);

                    newFile = new FileWriter("str.txt");
                    String str = textArea.getText();
                    newFile.write(str);
                    newFile.close();

                } catch (IOException ex) {
                    Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        openItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                FileChooser chooser = new FileChooser();
                chooser.setTitle("as");
                File f = chooser.showOpenDialog(null);
                // checks on f
                 newFile = f;

                Scanner sc = null;
                try {
                    sc = new Scanner(newFile);
                    String fullFileText = "";
                    while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        fullFileText+=line + "\n";
                    }
                    
                    textArea.clear();
                    textArea.setText(fullFileText);
               } catch (FileNotFoundException ex) {
                    Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    if(sc!=null){
                        sc.close();
                    }
                }

            }

        }
        );
        //exit
        exitItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                primaryStage.close();

            }

        }
        );
        //cut
        cutItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                strCop = textArea.getSelectedText();
                textArea.replaceSelection(" ");

            }

        }
        );
        //copy
        copyItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                strCop = textArea.getSelectedText();
            }

        }
        );
        //paste
        pasteItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                textArea.appendText(strCop);
            }

        }
        );
        //delete
        deleteItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                textArea.clear();
            }

        }
        );
        //selectAll
        selectAllItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                textArea.selectAll();
            }

        }
        );

        //undo
        undoItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                textArea.undo();
            }

        }
        );

        aboutItem.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent e) {
                Text hi = new Text("Notepad App developed by : shimaa \n\t\t\t12/2019");
                BorderPane note = new BorderPane();
                note.setCenter(hi);
                Scene scene = new Scene(note, 250, 200);
                Stage stage = new Stage();
                stage.setTitle("New Window");
                stage.setScene(scene);
                stage.show();
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
