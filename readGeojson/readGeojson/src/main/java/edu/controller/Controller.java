package edu.controller;

import edu.json.GetStyle;
import edu.utils.GeojsonUtil;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.servlet.http.HttpServletResponse;


@RestController
public class Controller {

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getLayer/ne_110m_admin_0_scale_rank.geojson",method = RequestMethod.GET)
    public void getGeo(HttpServletResponse response){
        String fileName = "file/ne_110m_admin_0_scale_rank.geojson";
        GeojsonUtil.getGeojson(fileName,response);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getLayer/places.geojson",method = RequestMethod.GET)
    public void getGeo1(HttpServletResponse response){
        String fileName = "file/places.geojson";
        GeojsonUtil.getGeojson(fileName,response);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getSLD/polygon_simplepolygonwithstroke.sld",method = RequestMethod.GET)
    public void getStyle(HttpServletResponse response){
        String fileName = "file/polygon_simplepolygonwithstroke.sld";
        GetStyle.getStyle(fileName,response);
    }
}
