
 package com.app.core;
 
 public enum ServicePlan 
 { 
	 SILVER(1000), GOLD(2000), DIAMOND(5000),PLATINUM(10000); 
	 private double PlanCost; 
	 
	 private ServicePlan(double planCost) {
		PlanCost = planCost;
	}

	public double getPlanCost() {
		return PlanCost;
	}

	public void setPlanCost(double planCost) {
		PlanCost = planCost;
	}

	@Override
	 public String toString() 
	 { 
		 return name()+"@"+PlanCost; 
		 }

 } 
 
 