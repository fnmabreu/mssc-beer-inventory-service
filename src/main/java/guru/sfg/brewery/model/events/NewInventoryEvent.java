package guru.sfg.brewery.model.events;

import lombok.NoArgsConstructor;

/**
 * Created by fabreu on 26/11/2021
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
