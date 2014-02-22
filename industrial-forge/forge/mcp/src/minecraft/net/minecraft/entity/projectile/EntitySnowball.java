package net.minecraft.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySnowball extends EntityThrowable
{
	public static int type = 0;
	
    public EntitySnowball(World par1World)
    {
        super(par1World);
    }

    public EntitySnowball(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }

    public EntitySnowball(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
            byte b0 = 5;

            if (par1MovingObjectPosition.entityHit instanceof EntityBlaze)
            {
                b0 = 3;
            }
            
            if (par1MovingObjectPosition.entityHit instanceof EntitySnowman)
            {
                b0 = 0;
            }
            
            if (par1MovingObjectPosition.entityHit instanceof EntitySlime)
            {
                b0 = 0;
            }

            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
        	if(type == 1 || type == 2){
        		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 10, true);
        	}
        	if(type == 2){
        		
        	}else{
        		this.setDead();
        	}
        }
    }
}
