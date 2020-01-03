package org.itstack.demo.dao;

import org.itstack.demo.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);

}
