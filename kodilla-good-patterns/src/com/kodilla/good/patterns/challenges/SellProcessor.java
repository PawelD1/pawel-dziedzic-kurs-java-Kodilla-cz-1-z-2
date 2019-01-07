package com.kodilla.good.patterns.challenges;

public class SellProcessor {

    private InformationService informationService;
    private SellService sellService;
    private SellRepository sellRepository;

    public SellProcessor(final InformationService informationService,
                           final SellService sellService,
                           final SellRepository sellRepository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }

    public SaleDTO process(final SellRequest sellRequest) {
        boolean isSold = sellService.sell(sellRequest.getNameOfProduct(),sellRequest.getPrice(), sellRequest.getUser());

        if(isSold) {
            informationService.info(sellRequest.getUser(),sellRequest.getNameOfProduct());
            sellRepository.addToRepository( sellRequest.getNameOfProduct(),sellRequest.getUser());
            return new SaleDTO(sellRequest.getUser(), true);
        } else {
            return new SaleDTO(sellRequest.getUser(), false);
        }
    }
}


