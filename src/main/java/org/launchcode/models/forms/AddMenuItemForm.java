package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

        @NotNull
        private int id;

        @NotNull
        private int cheeseId;

        private Iterable<Cheese> cheeses;

        private Menu menu;

        public AddMenuItemForm() {
        }

        public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu) {
                this.cheeses = cheeses;
                this.menu = menu;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getCheeseId() {
                return cheeseId;
        }

        public void setCheeseId(int cheeseId) {
                this.cheeseId = cheeseId;
        }

        public Iterable<Cheese> getCheeses() {
                return cheeses;
        }

        public Menu getMenu(){
                return menu;
        }

}