package me.mohammedriaz.repositories.hospital;

import me.mohammedriaz.domain.hospital.Room;
import me.mohammedriaz.factories.hospital.RoomFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import me.mohammedriaz.repositories.Impl.RoomRepositoryImpl;

public class RoomRepositoryTest {


    RoomRepositoryImpl roomRepository;

    @Before
    public void setUp() throws Exception {

        roomRepository = RoomRepositoryImpl.getRoomRepository();

    }

    @Test
    public void create() {

        Room room = RoomFactory.getRoom(1, null);
        roomRepository.create(room);

        Assert.assertNotNull(roomRepository.getAll());


    }

    @Test
    public void read() {


        Room room = RoomFactory.getRoom(1, null);
        roomRepository.create(room);

        Assert.assertNotNull(roomRepository.getAll());

        Room room1 = roomRepository.find(room.getRoomId());

        Assert.assertEquals(room, room1);


    }

    @Test
    public void update() {

        Room room = RoomFactory.getRoom(1, null);
        roomRepository.create(room);

        Assert.assertNotNull(roomRepository.getAll());

        Room room1 = RoomFactory.getRoom(2, null);
        room1.setRoomId(room.getRoomId());
        roomRepository.update(room1);

        Room update = roomRepository.find(room1.getRoomId());

        Assert.assertEquals(room1, update);

    }

    @Test
    public void delete() {

        Room room = RoomFactory.getRoom(1, null);
        roomRepository.create(room);

        Assert.assertNotNull(roomRepository.getAll());

        roomRepository.delete(room.getRoomId());

        Room room1 = roomRepository.find(room.getRoomId());

        Assert.assertNull(room1);

    }
}