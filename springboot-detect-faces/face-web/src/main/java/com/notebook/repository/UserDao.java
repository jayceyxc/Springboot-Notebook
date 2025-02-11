package com.notebook.repository;

import com.notebook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiaofu
 * @Description:
 * @date 2021/10/29
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
