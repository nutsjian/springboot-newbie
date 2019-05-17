package me.nutsjian.springboot.newbie.service;

import me.nutsjian.springboot.newbie.condition.MetadataGetCondition;
import me.nutsjian.springboot.newbie.dto.NameValueDTO;
import me.nutsjian.springboot.newbie.dto.Response;
import me.nutsjian.springboot.newbie.generated.tables.DsHuatuo;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import static org.jooq.impl.DSL.*;

@Service
public class JOOQTestService {

    @Autowired
    private DSLContext dsl;

    me.nutsjian.springboot.newbie.generated.tables.DsHuatuo huatuo =  DsHuatuo.DS_HUATUO.as("huatuo");

    public Response metadataGet(MetadataGetCondition condition) {
        Field<BigDecimal> _valueField = field(sum(huatuo.PJHF).div(count()));
        List<NameValueDTO> dtos = this.dsl.select(huatuo.NAME, _valueField)
                .from(huatuo)
                .where(huatuo.YEAR.eq("2017"))
                .groupBy(huatuo.NAME)
                .orderBy(_valueField.desc())
                .limit(10)
                .fetchInto(NameValueDTO.class);
        return Response.ok(dtos);
    }

    public Response metadataFetch(String parames) {
        System.out.println(parames);
        return Response.SUCCESS;
    }
}
