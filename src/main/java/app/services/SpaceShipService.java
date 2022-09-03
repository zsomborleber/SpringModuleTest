package app.services;

import app.models.SpaceShip;
import app.repositories.SpaceShipRepo;
import org.springframework.stereotype.Service;

@Service
public class SpaceShipService {
    private final SpaceShipRepo spaceShipRepo;

    public SpaceShipService(SpaceShipRepo spaceShipRepo) {
        this.spaceShipRepo = spaceShipRepo;
    }



}
