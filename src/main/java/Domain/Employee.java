package Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false, updatable = false)
        private Long id;
        private String name;
        private String emailS;
        private String jobTitle;
        private String phone;
        private String imageUrl;
        @Column(nullable = false, updatable = false)
        private String employeeID;

        public Employee() {}

        public Employee(Long id, String name, String emailS, String jobTitle, String phone, String imageUrl, String employeeID) {
                this.id = id;
                this.name = name;
                this.emailS = emailS;
                this.jobTitle = jobTitle;
                this.phone = phone;
                this.imageUrl = imageUrl;
                this.employeeID = employeeID;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmailS() {
                return emailS;
        }

        public void setEmailS(String emailS) {
                this.emailS = emailS;
        }

        public String getJobTitle() {
                return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
                this.jobTitle = jobTitle;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUri) {
                this.imageUrl = imageUri;
        }

        public String getEmployeeID() {
                return employeeID;
        }

         public void setEmployeeID(String employeeID) {
                this.employeeID = employeeID;
        }

        @Override
        public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", emailS='" + emailS + '\'' +
                        ", jobTitle='" + jobTitle + '\'' +
                        ", phone='" + phone + '\'' +
                        ", imageUri='" + imageUrl + '\'' +
                        ", employeeID='" + employeeID + '\'' +
                        '}';
        }
}
