package com.example.Repository;

import com.example.model.Agent;

import java.util.List;

public interface AgentRepository {
    void addAgent(Agent agent);
    Agent getAgentByid(String id);
    List<Agent> getAllAgents();
    boolean getStateOfAgent(String id);
}
