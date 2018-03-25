package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.TrackDao;
import com.mycompany.app.entities.Track;
import org.springframework.beans.factory.annotation.Autowired;

public class TrackWorker {

    @Autowired
    TrackDao addressDao;

    public Track addTrack(Track track){
        track = addressDao.addInstance(track);
        return track;
    }
}