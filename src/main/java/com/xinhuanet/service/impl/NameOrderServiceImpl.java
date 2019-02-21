package com.xinhuanet.service.impl;

import com.xinhuanet.entity.NameOrder;
import com.xinhuanet.mapper.NameOrderMapper;
import com.xinhuanet.service.NameOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class NameOrderServiceImpl implements NameOrderService {

	@Autowired
	private NameOrderMapper nameOrderMapper;
	
	@Override
	public NameOrder get(Long id) {
		return nameOrderMapper.get(id);
	}

	
	

}
