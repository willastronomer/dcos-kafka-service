package org.apache.mesos.kafka.plan;

import java.util.Arrays;
import java.util.List;

import org.apache.mesos.kafka.offer.OfferRequirementProvider;

public class KafkaUpdatePlan implements Plan {
  private KafkaPhase phase;

  public KafkaUpdatePlan(String configName, OfferRequirementProvider offerReqProvider) {
    phase = new KafkaPhase(configName, offerReqProvider);
  }

  public List<Phase> getPhases() {
    return Arrays.asList(phase);
  }

  public Phase getCurrentPhase() {
    return phase;
  }

  public boolean isComplete() {
    return phase.isComplete();
  }
}
