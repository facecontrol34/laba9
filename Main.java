package com.company;

import java.util.Scanner;

interface Tovar{
    void NameTov();
    void CenaTov();
    void ReitTov();
    void TovInfo();
}
interface User{
    void Login();
    void Password();
    void UserInfo();
}
public class Main {
    static class Tov1 implements Tovar{
        String name;
        int cena;
        int reit;
        Tov1(String name, int cena, int reit){
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void NameTov(){
            System.out.printf("Название товара: %s \n", name);
        }

        public void CenaTov(){
            System.out.printf("Цена товара: %s руб \n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }

        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
    }
    static class Tov2 implements Tovar{
        String name;
        int cena;
        int reit;
        Tov2(String name, int cena, int reit){
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void NameTov(){
            System.out.printf("Название товара: %s\n", name);
        }

        public void CenaTov(){
            System.out.printf("Цена товар: %s руб\n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
    }
    static class Tov3 implements Tovar{
        String name;
        int cena;
        int reit;
        Tov3(String name, int cena, int reit){
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void NameTov(){
            System.out.printf("Название товара: %s\n", name);
        }

        public void CenaTov(){
            System.out.printf("Цена товара: %s руб\n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
    }
    static class User1 implements User{
        String login;
        String password;
        User1(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class User2 implements User{
        String login;
        String password;
        User2(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class User3 implements User{
        String login;
        String password;
        User3(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class Pokypka implements User, Tovar{
        String login;
        String password;
        String name;
        int cena;
        int reit;
        Pokypka(String login, String password,String name, int cena, int reit){
            this.login = login;
            this.password = password;
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
        public void NameTov(){
            System.out.printf("Название товара: %s\n", name);
        }

        public void CenaTov(){
            System.out.printf("Цена товара: %s руб\n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);

        }
        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
        public void PrintPok(){
            System.out.printf("Пользователя: %s Купил товар: %s", login, name);
        }
    }
    public static void main(String[] args) {
        Tovar chocolate = new Tov1("шоколад",54, 10);
        chocolate.TovInfo();
        Tovar cheese = new Tov2("сыр", 60,5);
        cheese.TovInfo();
        Tovar tomato = new Tov3("помидоры", 80, 7);
        tomato.TovInfo();
        User peron1 = new User1("Gena", "54312");
        peron1.UserInfo();
        User peron2 = new User2("Poly","201314");
        peron2.UserInfo();
        User peron3 = new User3("Sasha","543975759");
        peron3.UserInfo();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин");
        String log = in.nextLine();
        System.out.println("Введите пароль");
        String pas = in.nextLine();
        System.out.println("Введите товар, который хотите купить");
        String tov = in.nextLine();
        Pokypka pokypka = new Pokypka(log,pas,tov,54, 10);
        pokypka.PrintPok();
    }
}




