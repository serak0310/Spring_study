package hello.hellospring.domain;

// 회원 객체
public class Member {
    private Long id;
    private String name;

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}
