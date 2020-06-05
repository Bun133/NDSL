package com.ndsl.bun133.game.map;

import com.ndsl.bun133.game.map.chunk.Chunk;
import com.ndsl.bun133.game.map.chunk.block.onMapBlock;
import com.ndsl.bun133.game.map.gen.IGenerator;
import com.ndsl.bun133.game.map.graphics.BlockDrawable;
import com.ndsl.bun133.game.map.pos.ChunkPos;
import com.ndsl.bun133.game.map.pos.Rect;
import com.ndsl.bun133.game.map.pos.onMapBlockPos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map {
    private java.util.Map<ChunkPos, Chunk> ChunkMap=new HashMap<ChunkPos,Chunk>();

    public Map(){
        generator.generateChunk(new ChunkPos(0,0));
    }

    public List<BlockDrawable> getAll(){
        List<BlockDrawable> drawables=new ArrayList<>();
        for(Chunk chunk:ChunkMap.values()){
            for(onMapBlock block:chunk.BlockMap.values()){
                drawables.add(block.getDrawable());
            }
        }
        return drawables;
    }

    public int shift_x;
    public int shift_y;

    public boolean isShowing(onMapBlock block){
        return this.isShowing(block.pos);
    }

    public boolean isShowing(onMapBlockPos pos) {
        return getShowingRect().isContain(pos.getRect());
    }

    public Rect getShowingRect(){
        return new Rect(-shift_x,-shift_y,-shift_x+1920,-shift_y+1080);
    }

    public Chunk getChunk(ChunkPos pos){
        if (!ChunkMap.containsKey(pos)) {
            generator.generateChunk(pos);
        }
        return ChunkMap.get(pos);
    }
    public generator generator=new generator();
    public class generator{
        private generator(){}

        public List<IGenerator> generatorList=new ArrayList<>();

        public Chunk generateChunk(ChunkPos pos){
            Chunk chunk=new Chunk(pos,Map.this);
            for(IGenerator generator:generatorList){
                chunk = generator.gen(chunk);
            }
            return chunk;
        }
    }
}
