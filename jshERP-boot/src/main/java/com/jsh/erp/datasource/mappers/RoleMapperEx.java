package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.Role;
import com.jsh.erp.datasource.entities.RoleEx;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapperEx {

  List<RoleEx> selectByConditionRole(
      @Param("name") String name,
      @Param("description") String description,
      @Param("offset") Integer offset,
      @Param("rows") Integer rows);

  Long countsByRole(@Param("name") String name, @Param("description") String description);

  int batchDeleteRoleByIds(
      @Param("updateTime") Date updateTime,
      @Param("updater") Long updater,
      @Param("ids") String ids[]);

  Role getRoleWithoutTenant(@Param("roleId") Long roleId);
}
