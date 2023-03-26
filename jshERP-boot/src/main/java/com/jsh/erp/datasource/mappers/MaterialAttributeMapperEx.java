package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.MaterialAttribute;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialAttributeMapperEx {

  List<MaterialAttribute> selectByConditionMaterialAttribute(
      @Param("attributeName") String attributeName,
      @Param("offset") Integer offset,
      @Param("rows") Integer rows);

  Long countsByMaterialAttribute(@Param("attributeField") String attributeField);

  int batchDeleteMaterialAttributeByIds(@Param("ids") String ids[]);
}
