package com.zhou.testareo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/profile.html").setViewName("profile");
        registry.addViewController("/graph_echarts.html").setViewName("graph_echarts");
        registry.addViewController("/index_v1.html").setViewName("index_v1");
        registry.addViewController("/index_v2.html").setViewName("index_v2");
        registry.addViewController("mailbox.html").setViewName("mailbox");
        registry.addViewController("notifications.html").setViewName("notifications");
        registry.addViewController("monitor.html").setViewName("monitor");
        registry.addViewController("fontawesome.html").setViewName("fontawesome");
        registry.addViewController("glyphicons.html").setViewName("glyphicons");
        registry.addViewController("buttons.html").setViewName("buttons");
        registry.addViewController("agile_board.html").setViewName("agile_board");
        registry.addViewController("tabs_panels.html").setViewName("tabs_panels");
        registry.addViewController("notifications.html").setViewName("notifications");
        registry.addViewController("badges_labels.html").setViewName("badges_labels");
        registry.addViewController("grid_options.html").setViewName("grid_options");
        registry.addViewController("plyr.html").setViewName("plyr");
        registry.addViewController("layer.html").setViewName("layer");
        registry.addViewController("modal_window.html").setViewName("modal_window");
        registry.addViewController("sweetalert.html").setViewName("sweetalert");
        registry.addViewController("jstree.html").setViewName("jstree");
        registry.addViewController("tree_view.html").setViewName("tree_view");
        registry.addViewController("nestable_list.html").setViewName("nestable_list");
        registry.addViewController("toastr_notifications.html").setViewName("toastr_notifications");
        registry.addViewController("diff.html").setViewName("diff");
        registry.addViewController("spinners.html").setViewName("spinners");
        registry.addViewController("widgets.html").setViewName("widgets");
        registry.addViewController("table_basic.html").setViewName("table_basic");
        registry.addViewController("table_data_tables.html").setViewName("table_data_tables");
        registry.addViewController("table_jqgrid.html").setViewName("table_jqgrid");
        registry.addViewController("table_foo_table.html").setViewName("table_foo_table");
        registry.addViewController("table_bootstrap.html").setViewName("table_bootstrap");
        registry.addViewController("agile_board.html").setViewName("agile_board");
        registry.addViewController("list.html").setViewName("list");

    }
}
