package com.example.Repository;

import com.example.model.Agent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgentRepostioryImpl implements AgentRepository{
    private final Map<String,Agent> agentMap = new HashMap<>();
    private final Map<String,List<String>> workHistory = new HashMap<>();

    @Override
    public void addAgent(Agent agent) {
        agentMap.put(agent.getId(),agent);
        System.out.println("Agent succesfully added");

    }

    @Override
    public Agent getAgentByid(String id) {
        if(id!=null){
            return agentMap.get(id);
        }

        return null;
    }

    @Override
    public List<Agent> getAllAgents() {
        return new ArrayList<>(agentMap.values());


    }

    @Override
    public boolean getStateOfAgent(String id) {
        if(id!=null){
            Agent agent = agentMap.get(id);
            return agent.isAvailable();
        }

        return false;
    }
}
