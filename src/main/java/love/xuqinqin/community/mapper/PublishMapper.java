package love.xuqinqin.community.mapper;

import love.xuqinqin.community.model.Publish;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author FGuy
 * @Date 2020/2/28 20:28
 */
@Mapper
public interface PublishMapper {

    @Insert("insert into publish(title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmt_create},#{gmt_modified},#{creator},#{tag})")
    void insert(Publish publish);

    @Select("select * from publish")
    List<Publish> select();

}
