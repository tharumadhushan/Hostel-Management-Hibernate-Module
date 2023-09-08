package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBo;
import lk.ijse.model.RoomDTO;

import java.sql.SQLException;

public interface RoomBO extends SuperBo {
    boolean delete(String id) throws SQLException;

    boolean save(RoomDTO dto) throws SQLException;

    RoomDTO search(String id) throws SQLException;

    boolean Update(RoomDTO dto) throws SQLException;
}
