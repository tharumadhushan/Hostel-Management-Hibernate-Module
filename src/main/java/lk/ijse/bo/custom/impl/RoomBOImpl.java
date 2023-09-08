package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.RoomBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.RoomDAO;
import lk.ijse.entity.Room;
import lk.ijse.model.RoomDTO;

import java.sql.SQLException;

public class RoomBOImpl implements RoomBO {

    RoomDAO roomDAO= (RoomDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ROOM);

    @Override
    public boolean delete(String id) throws SQLException {
        return roomDAO.delete(id);
    }


    @Override
    public boolean save(RoomDTO dto) throws SQLException {
        return roomDAO.save(new Room(dto.getRoom_type_id(),dto.getType(),dto.getKey_money(),dto.getQty(),dto.getResList()));
    }

    @Override
    public RoomDTO search(String id) throws SQLException {
        Room room=roomDAO.search(id);
        return new RoomDTO(room.getRoom_type_id(),room.getType(),room.getKey_money(),room.getQty());
    }

    @Override
    public boolean Update(RoomDTO dto) throws SQLException {
        return roomDAO.Update(new Room(dto.getRoom_type_id(),dto.getType(),dto.getKey_money(),dto.getQty(),dto.getResList()));
    }
}
