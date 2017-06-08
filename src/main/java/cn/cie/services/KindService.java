package cn.cie.services;

import cn.cie.entity.Kind;
import cn.cie.entity.dto.GameDTO;
import cn.cie.common.utils.Result;

import java.util.List;

/**
 * Created by RojerAlone on 2017/6/6.
 */
public interface KindService {

    /**
     * 获取所有的种类
     * @return
     */
    Result<Kind> getAll();

    /**
     * 根据种类获取所有的游戏，包括游戏信息和游戏的种类，不包括标签
     * @param kind
     * @return
     */
    Result<List<GameDTO>> getGamesByKind(int kind);

}