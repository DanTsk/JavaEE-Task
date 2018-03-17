package com.mycompany.app.workers;

import com.mycompany.app.daos.interfaces.AddressDao;
import com.mycompany.app.daos.interfaces.ArtistDao;
import com.mycompany.app.entities.Address;
import com.mycompany.app.entities.Artist;
import org.springframework.beans.factory.annotation.Autowired;

public class ArtistsWorker {

    @Autowired
    ArtistDao addressDao;

    public Artist addArtist(Artist art){
        art = addressDao.addInstance(art);
        return art;
    }
}
