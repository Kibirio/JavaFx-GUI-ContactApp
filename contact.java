
public class contact {
    private Integer cid;
    private String fname;
    private String lname;
    private String groupc;
    private int phone;
    private String address;
    private String email;
    private byte[] pic;
    private int uid;

    public contact(Integer cid, String fname, String lname, String groupc, int phone, String email, String address, byte[] pic, int uid)
    {
        this.cid = cid;
        this.fname = fname;
        this.lname = lname;
        this.groupc = groupc;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.pic = pic;
        this.uid = uid; 
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGroupc() {
        return groupc;
    }

    public void setGroupc(String groupc) {
        this.groupc = groupc;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
   
}
