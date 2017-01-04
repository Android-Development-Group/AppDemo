package com.myself.appdemo.db.dao;

import com.myself.appdemo.db.entity.CityDB;
import com.myself.appdemo.db.entity.CompanionDB;
import com.myself.appdemo.db.entity.DistrictDB;
import com.myself.appdemo.db.entity.PaibandDB;
import com.myself.appdemo.db.entity.ProvinceDB;
import com.myself.appdemo.db.entity.PushMessageDB;
import com.myself.appdemo.db.entity.TemplateDB;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig provinceDBDaoConfig;
    private final DaoConfig cityDBDaoConfig;
    private final DaoConfig districtDBDaoConfig;
    private final DaoConfig companionDBDaoConfig;
    private final DaoConfig templateDBDaoConfig;
    private final DaoConfig paibandDBDaoConfig;
    private final DaoConfig pushMessageDBDaoConfig;

    private final ProvinceDBDao provinceDBDao;
    private final CityDBDao cityDBDao;
    private final DistrictDBDao districtDBDao;
    private final CompanionDBDao companionDBDao;
    private final TemplateDBDao templateDBDao;
    private final PaibandDBDao paibandDBDao;
    private final PushMessageDBDao pushMessageDBDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        provinceDBDaoConfig = daoConfigMap.get(ProvinceDBDao.class).clone();
        provinceDBDaoConfig.initIdentityScope(type);

        cityDBDaoConfig = daoConfigMap.get(CityDBDao.class).clone();
        cityDBDaoConfig.initIdentityScope(type);

        districtDBDaoConfig = daoConfigMap.get(DistrictDBDao.class).clone();
        districtDBDaoConfig.initIdentityScope(type);

        companionDBDaoConfig = daoConfigMap.get(CompanionDBDao.class).clone();
        companionDBDaoConfig.initIdentityScope(type);

        templateDBDaoConfig = daoConfigMap.get(TemplateDBDao.class).clone();
        templateDBDaoConfig.initIdentityScope(type);

        paibandDBDaoConfig = daoConfigMap.get(PaibandDBDao.class).clone();
        paibandDBDaoConfig.initIdentityScope(type);

        pushMessageDBDaoConfig = daoConfigMap.get(PushMessageDBDao.class).clone();
        pushMessageDBDaoConfig.initIdentityScope(type);

        provinceDBDao = new ProvinceDBDao(provinceDBDaoConfig, this);
        cityDBDao = new CityDBDao(cityDBDaoConfig, this);
        districtDBDao = new DistrictDBDao(districtDBDaoConfig, this);
        companionDBDao = new CompanionDBDao(companionDBDaoConfig, this);
        templateDBDao = new TemplateDBDao(templateDBDaoConfig, this);
        paibandDBDao = new PaibandDBDao(paibandDBDaoConfig, this);
        pushMessageDBDao = new PushMessageDBDao(pushMessageDBDaoConfig, this);

        registerDao(ProvinceDB.class, provinceDBDao);
        registerDao(CityDB.class, cityDBDao);
        registerDao(DistrictDB.class, districtDBDao);
        registerDao(CompanionDB.class, companionDBDao);
        registerDao(TemplateDB.class, templateDBDao);
        registerDao(PaibandDB.class, paibandDBDao);
        registerDao(PushMessageDB.class, pushMessageDBDao);
    }
    
    public void clear() {
        provinceDBDaoConfig.clearIdentityScope();
        cityDBDaoConfig.clearIdentityScope();
        districtDBDaoConfig.clearIdentityScope();
        companionDBDaoConfig.clearIdentityScope();
        templateDBDaoConfig.clearIdentityScope();
        paibandDBDaoConfig.clearIdentityScope();
        pushMessageDBDaoConfig.clearIdentityScope();
    }

    public ProvinceDBDao getProvinceDBDao() {
        return provinceDBDao;
    }

    public CityDBDao getCityDBDao() {
        return cityDBDao;
    }

    public DistrictDBDao getDistrictDBDao() {
        return districtDBDao;
    }

    public CompanionDBDao getCompanionDBDao() {
        return companionDBDao;
    }

    public TemplateDBDao getTemplateDBDao() {
        return templateDBDao;
    }

    public PaibandDBDao getPaibandDBDao() {
        return paibandDBDao;
    }

    public PushMessageDBDao getPushMessageDBDao() {
        return pushMessageDBDao;
    }

}
