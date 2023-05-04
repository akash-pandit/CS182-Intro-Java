class TV_Actor {
    // private variables to hold the actor's name and show
    private String name;
    private String show;

    /**
     * constructor TV_Actor (no params)
     * creates an "empty" TV_Actor object with no known name or show
     */
    TV_Actor() {
        name = "Unknown Name";
        show = "Unknown Show";
    }

    /**
     * constructor TV_Actor (name, show params)
     * creates a TV_Actor object with the given parameters
     * @param inName - the name of the actor
     * @param inShow - the show of the actor
     */
    TV_Actor(String inName, String inShow) {
        name = inName;
        show = inShow;
    }

    /**
     * getter for actor's name
     * @return the actor's name (String)
     */
    public String getName() {
        return name;
    }

    /**
     * setter for actor's name
     * @param inName - the name to set for an actor
     */
    public void setName(String inName) {
        name = inName;
    }

    /**
     * getter for actor's show
     * @return the actor's show  (String)
     */
    public String getShow() {
        return show;
    }

    /**
     * setter for actor's show
     * @param inShow - the show to set for an actor
     */
    public void setShow(String inShow) {
        show = inShow;
    }

    /**
     * Code to print out a TV_Actor object
     * put in TV_Actor class file, this overrides the default .toString()
     * @return formatted TV_Actor output
     */
    public String toString() {
        String output = "Name: " + name + ", Show: " + show;
        return output;
    }

}
