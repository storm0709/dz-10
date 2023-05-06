import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        Amount amt1 = new Amount("accountId000", 50, "USD");
        Amount amt2 = new Amount("accountId003", 250, "HRV");
        Amount amt3 = new Amount("accountId001", 50, "EUR");
        Amount amt4 = new Amount("accountId001", 50, "USD");
        Amount amt5 = new Amount("accountId001", 500, "USD");

        System.out.println("accountId000 50 USD:");
        try {
            bankApplication.process(amt1.getId(), amt1.getAmount(), amt1.getCurrency());
        } catch (WrongAccountException a ){
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException c){
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException o){
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println();
        System.out.println("accountId003 250 HRV:");
        try {
            bankApplication.process(amt2.getId(),amt2.getAmount(),amt2.getCurrency());
        } catch (WrongAccountException a ){
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException c){
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException o){
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println();
        System.out.println("accountId001 50 EUR:");
        try {
            bankApplication.process(amt3.getId(),amt3.getAmount(),amt3.getCurrency());
        } catch (WrongAccountException a ){
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException c){
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException o){
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println();
        System.out.println("accountId001 50 USD:");
        try {
            bankApplication.process(amt4.getId(),amt4.getAmount(),amt4.getCurrency());
        } catch (WrongAccountException a ){
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException c){
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException o){
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println();
        System.out.println("accountId001 50 USD:");
        try {
            bankApplication.process(amt5.getId(),amt5.getAmount(),amt5.getCurrency());
        } catch (WrongAccountException a ){
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException c){
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException o){
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e){
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
    }
}