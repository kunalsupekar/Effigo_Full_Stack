public class User {

    private String username;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) { 
        if(age<0){
            throw new IllegalArgumentException("Age cannot be Negative");
        }
            this.age = age;
              
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        if(username==null || username.isBlank()){
            throw new IllegalArgumentException("username cannot be null");
        }
            this.username = username;

        
    }


}
