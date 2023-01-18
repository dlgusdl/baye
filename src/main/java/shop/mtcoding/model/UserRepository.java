package shop.mtcoding.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/*
 * 회원가입, 로그인, 회원탈퇴, 회원수정
 */
@Mapper
// interface - 행을 리턴한다.
public interface UserRepository {
    public int insert(String username, String password, String email);

    public List<User> findAll();

    public User findById(int id);

    public int updateById(int id, String password);

    public int deleteById(int id);

    // public int insert(String username, String password, String email);

    // public User login(String username, String password);

    // public int delete(int id);

    // public int update(int id, String password);

    /// public int passwordUpdate(int id, String password);
}
