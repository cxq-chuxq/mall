package club.banyuan.blog.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.prestige
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    private Integer prestige;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.created_at
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.updated_at
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.prestige
     *
     * @return the value of user.prestige
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public Integer getPrestige() {
        return prestige;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.prestige
     *
     * @param prestige the value for user.prestige
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public void setPrestige(Integer prestige) {
        this.prestige = prestige;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.created_at
     *
     * @return the value of user.created_at
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.created_at
     *
     * @param createdAt the value for user.created_at
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.updated_at
     *
     * @return the value of user.updated_at
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.updated_at
     *
     * @param updatedAt the value for user.updated_at
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Jun 17 18:45:16 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", prestige=").append(prestige);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}