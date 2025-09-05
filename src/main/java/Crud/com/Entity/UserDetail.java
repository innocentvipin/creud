package Crud.com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name = "userDetail")
public class UserDetail {
    private String name;
    @Id
    private String  userId;
    private int age;

    public UserDetail(String name, String userId, int age) {
        this.name = name;
        this.userId = userId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

