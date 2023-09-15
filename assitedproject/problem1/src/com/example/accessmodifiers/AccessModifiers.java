package com.example.accessmodifiers;


public class AccessModifiers {
 public int publicVar = 10;         // Public variable
 protected int protectedVar = 20;   // Protected variable
 int defaultVar = 30;               // Default (package-private) variable
 private int privateVar = 40;       // Private variable

 public void publicMethod() {
     System.out.println("This is a public method.");
 }

 protected void protectedMethod() {
     System.out.println("This is a protected method.");
 }

 void defaultMethod() {
     System.out.println("This is a default method.");
 }

 private void privateMethod() {
     System.out.println("This is a private method.");
 }

 public static void main(String[] args) {
     AccessModifiers obj = new AccessModifiers();

     // Accessing variables and methods within the same class
     System.out.println("Accessing variables and methods within the same class:");
     System.out.println("Public variable: " + obj.publicVar);
     System.out.println("Protected variable: " + obj.protectedVar);
     System.out.println("Default variable: " + obj.defaultVar);
     System.out.println("Private variable: " + obj.privateVar);
     obj.publicMethod();
     obj.protectedMethod();
     obj.defaultMethod();
     obj.privateMethod();
 }
}

