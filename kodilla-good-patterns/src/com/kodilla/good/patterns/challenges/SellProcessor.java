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
            SaleDTO sD=new SaleDTO(sellRequest.getUser(),true);
            System.out.println("The order is complete.");
            //System.out.println("The order "+sellRequest.getNameOfProduct().toString()+"for"+sellRequest.getUser().toString()+" is complete and ready to send.");
            return new SaleDTO(sellRequest.getUser(), true);
        } else {
            SaleDTO sD=new SaleDTO(sellRequest.getUser(),true);
            System.out.println("The order is not complete.");
            return new SaleDTO(sellRequest.getUser(), false);

        }
    }
}


