package com.artemis.generator.strategy;

import com.artemis.generator.model.ClassModel;
import com.artemis.generator.strategy.common.StrategyTest;
import com.artemis.generator.test.Flag;
import org.junit.Test;

/**
 * Created by Daan on 10-9-2016.
 */
public class CreateLifecycleStrategyTest extends StrategyTest {

    @Test
    public void When_component_Should_add_create_lifecycle_method() {
        ClassModel model = applyStrategy(CreateLifecycleStrategy.class, Flag.class);
        assertHasMethod(model,"E flag()");
    }
}