package com.cafedal.webapp.entity;

public class Mypage {
   String id;
   String pwd;
   String name;
   String mail;
   String birth;
   String cafename;
   
   public Mypage() {
   }

   public Mypage(String id, String pwd, String name, String mail, String birth, String cafename) {
      super();
      this.id = id;
      this.pwd = pwd;
      this.name = name;
      this.mail = mail;
      this.birth = birth;
      this.cafename = cafename;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPwd() {
      return pwd;
   }

   public void setPwd(String pwd) {
      this.pwd = pwd;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getMail() {
      return mail;
   }

   public void setMail(String mail) {
      this.mail = mail;
   }

   public String getBirth() {
      return birth;
   }

   public void setBirth(String birth) {
      this.birth = birth;
   }

   public String getCafename() {
      return cafename;
   }

   public void setCafename(String cafename) {
      this.cafename = cafename;
   }
   
   
}