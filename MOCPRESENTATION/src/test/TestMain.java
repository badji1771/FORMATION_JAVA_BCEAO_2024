package test;

import presentation.Vue;

public class TestMain {

	public static void main(String[] args) {
		Vue vue = new Vue();
		vue.createClient();
		vue.showAllClients();
		vue.exit();

	}

}
