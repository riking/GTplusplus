package gtPlusPlus.nei;

import cpw.mods.fml.common.event.FMLInterModComms;
import gtPlusPlus.core.lib.LoadedMods;
import net.minecraft.nbt.NBTTagCompound;

public class NEI_IMC_Sender {
    public static void IMCSender() {
        setNBTInfoAndSendIt("gtpp.recipe.alloyblastsmelter", "gregtech:gt.blockmachines:810", 1);
        setNBTInfoAndSendIt("gtpp.recipe.rocketenginefuel", "gregtech:gt.blockmachines:793");
        setNBTInfoAndSendIt("gtpp.recipe.cyclotron", "gregtech:gt.blockmachines:828");
        setNBTInfoAndSendIt("gtpp.recipe.chemicaldehydrator", "gregtech:gt.blockmachines:911", 1);
        setNBTInfoAndSendIt("gtpp.recipe.slowfusionreactor", "gregtech:gt.blockmachines:31015");
        setNBTInfoAndSendIt("gtpp.recipe.RTGgenerators", "gregtech:gt.blockmachines:869");
        setNBTInfoAndSendIt("gtpp.recipe.cokeoven", "gregtech:gt.blockmachines:791");
        setNBTInfoAndSendIt("gtpp.recipe.semifluidgeneratorfuels", "gregtech:gt.blockmachines:837");
        setNBTInfoAndSendIt("gtpp.recipe.fishpond", "gregtech:gt.blockmachines:829", 1);
        setNBTInfoAndSendIt("gtpp.recipe.multimixer", "gregtech:gt.blockmachines:811");
        setNBTInfoAndSendIt("gtpp.recipe.advanced.mixer", "gregtech:gt.blockmachines:811");
        setNBTInfoAndSendIt("gtpp.recipe.cryogenicfreezer", "gregtech:gt.blockmachines:910");
        setNBTInfoAndSendIt("gtpp.recipe.geothermalfuel", "gregtech:gt.blockmachines:830");
        setNBTInfoAndSendIt("gtpp.recipe.matterfab2", "gregtech:gt.blockmachines:799");
        setNBTInfoAndSendIt("gtpp.recipe.multicentrifuge", "gregtech:gt.blockmachines:790", 1);
        setNBTInfoAndSendIt("gtpp.recipe.multielectro", "gregtech:gt.blockmachines:796", 1);
        setNBTInfoAndSendIt("gtpp.recipe.simplewasher", "gregtech:gt.blockmachines:767");
        setNBTInfoAndSendIt("gtpp.recipe.vacfurnace", "gregtech:gt.blockmachines:995", 1);
        setNBTInfoAndSendIt("gtpp.recipe.thermalgeneratorfuel", "gregtech:gt.blockmachines:875", 1);
        setNBTInfoAndSendIt("gtpp.recipe.solartower", "gregtech:gt.blockmachines:863", 1);
        setNBTInfoAndSendIt("gtpp.recipe.fissionfuel", "gregtech:gt.blockmachines:835", 1);
        setNBTInfoAndSendIt("gtpp.recipe.lftr", "gregtech:gt.blockmachines:751", 1);
        setNBTInfoAndSendIt("gtpp.recipe.lftr.sparging", "gregtech:gt.blockmachines:31035", 1);
        setNBTInfoAndSendIt("gtpp.recipe.coldtrap", "gregtech:gt.blockmachines:31034");
        setNBTInfoAndSendIt("gtpp.recipe.reactorprocessingunit", "gregtech:gt.blockmachines:31032");
        setNBTInfoAndSendIt("gtpp.recipe.treefarm", "gregtech:gt.blockmachines:836");
        if (LoadedMods.AdvancedSolarPanel) {
        	setNBTInfoAndSendIt("gtpp.recipe.moleculartransformer", "AdvancedSolarPanel:BlockMolecularTransformer");
        }
    }


    private static void setNBTInfoAndSendIt(String aRecipeName, String aBlock) {
    	setNBTInfoAndSendIt(aRecipeName, aBlock, 2);
    }
    
    private static void setNBTInfoAndSendIt(String aRecipeName, String aBlock, int aRecipesPerPage) {
        NBTTagCompound aNBT = new NBTTagCompound();
        aNBT.setString("handler", aRecipeName);
        aNBT.setString("modName", "GT++");
        aNBT.setString("modId", "miscutils");
        aNBT.setBoolean("modRequired", true);
        aNBT.setString("itemName", aBlock);
        aNBT.setInteger("yShift", 6);
        aNBT.setInteger("handlerHeight", 135);
        aNBT.setInteger("handlerWidth", 166);
        aNBT.setInteger("maxRecipesPerPage", aRecipesPerPage);
        FMLInterModComms.sendMessage("NotEnoughItems", "registerHandlerInfo", aNBT);
    }
}
