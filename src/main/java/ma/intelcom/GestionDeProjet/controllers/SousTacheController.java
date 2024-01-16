package ma.intelcom.GestionDeProjet.controllers;

import ma.intelcom.GestionDeProjet.services.SousTacheService;

public class SousTacheController {

    private final SousTacheService sousTacheService;

    public SousTacheController(SousTacheService sousTacheService) {
        this.sousTacheService = sousTacheService;
    }
}
