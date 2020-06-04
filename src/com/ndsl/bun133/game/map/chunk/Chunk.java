package com.ndsl.bun133.game.map.chunk;

import com.ndsl.bun133.game.map.chunk.block.onMapBlock;
import com.ndsl.bun133.game.map.pos.onMapBlockPos;

import java.util.HashMap;
import java.util.Map;

public class Chunk {
    public Map<onMapBlockPos, onMapBlock> BlockMap=new HashMap<>();
}
