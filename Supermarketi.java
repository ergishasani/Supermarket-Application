package Projektet;

import javax.swing.JOptionPane;

public class Supermarketi {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Profili nr 1 (pin : 123)" + "\nProfili nr 2 (pin : 321)" + "\nProfili nr 3 (pin : 123123)", "User-at",
                JOptionPane.INFORMATION_MESSAGE);

        String punonjesit = JOptionPane.showInputDialog(null, "Cilin profil do te perdorni?");
        double nr = (int) Double.parseDouble(punonjesit);

        // Profili nr 1
        if (nr == 1) {
            String pini = JOptionPane.showInputDialog("Jepni pinin tuaj");
            double pin = (int) Double.parseDouble(pini);
            if (pin == 123) {
                JOptionPane.showMessageDialog(null, "Produktet jane:" + "\nProcesor (code 1) (520 pike)"
                        + "\nRam (code 2) (200 pike)" + "\nMouse (code 3) (139 pike)");
                String produktet = JOptionPane.showInputDialog(null, "Jepni produktet qe do te merrni :");
                double zgjedhja = (int) Double.parseDouble(produktet);
                if (zgjedhja == 1) {
                    JOptionPane.showMessageDialog(null, "Blerja juaj u krye me sukses! Ju keni fituar 520 pike");
                    JOptionPane.showMessageDialog(null,
                            "Produktet qe ju mund te merrni falas duke mbledhur pike jane  :"
                                    + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                    + "\n65% Keyboard (code 3) (700 pike)");
                    String piket1 = JOptionPane.showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                    double pik1 = (int) Double.parseDouble(piket1);
                    if (pik1 == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Produkti u mor me sukses, ju keni harxhuar 300 pike, ju kane mbetur dhe 220 pike");
                    }
                    if (pik1 == 2) {
                        JOptionPane.showMessageDialog(null, "Ju keni harxhuar 480 pike, ju kane mbetur dhe 40 pike");
                    }
                    if (pik1 == 3) {
                        JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                    }
                    boolean c = pik1 >= 4;
                    if (c) {
                        JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                    }
                    if (zgjedhja == 2) {
                        JOptionPane.showMessageDialog(null, "Blerja juaj u krye me sukses! Ju keni fituar 200 pike");
                        JOptionPane.showMessageDialog(null,
                                "Produktet qe ju mund te merrni falas duke mbledhur pike jane :"
                                        + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                        + "\n65% Keyboard (code 3) (700 pike)");
                        String piket2 = JOptionPane.showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                        double pik2 = (int) Double.parseDouble(piket2);
                        if (pik2 == 1) {
                            JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                        }
                        if (pik2 == 2) {
                            JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                        }
                        if (pik2 == 3) {
                            JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                        }
                        if (c) {
                            JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                        }
                        if (zgjedhja == 2) {
                            JOptionPane.showMessageDialog(null,
                                    "Blerja juaj u krye me sukses! Ju keni fituar 139 pike");
                            JOptionPane.showMessageDialog(null,
                                    "Produktet qe ju mund te merrni falas duke mbledhur pike jane :"
                                            + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                            + "\n65% Keyboard (code 3) (700 pike)");
                            String piket3 = JOptionPane
                                    .showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                            double pik3 = (int) Double.parseDouble(piket3);
                            if (pik3 == 1) {
                                JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                            }
                            if (pik3 == 2) {
                                JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                            }
                            if (pik3 == 3) {
                                JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                            }
                            if (c) {
                                JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                            }
                        }
                    }

                }

            }
        }
        // Profili nr 2
        if (nr == 2) {
            String pini = JOptionPane.showInputDialog("Jepni pinin tuaj");
            double pin = (int) Double.parseDouble(pini);
            if (pin == 321) {
                JOptionPane.showMessageDialog(null, "Produktet jane:" + "\nLaptop (code 1) (1400 pike)"
                        + "\nKompjuter (code 2) (3240 pike)" + "\nMonitor (code 3) (560 pike)");
                String produktet = JOptionPane.showInputDialog(null, "Jepni produktet qe do te merrni :");
                double zgjedhja = (int) Double.parseDouble(produktet);
                if (zgjedhja == 1) {
                    JOptionPane.showMessageDialog(null, "Blerja juaj u krye me sukses! Ju keni fituar 1400 pike");
                    JOptionPane.showMessageDialog(null,
                            "Produktet qe ju mund te merrni falas duke mbledhur pike jane  :"
                                    + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                    + "\n65% Keyboard (code 3) (700 pike)");
                    String piket1 = JOptionPane.showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                    double pik1 = (int) Double.parseDouble(piket1);
                    if (pik1 == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Produkti u mor me sukses, ju keni harxhuar 300 pike, ju kane mbetur dhe 1100 pike");
                    }
                    if (pik1 == 2) {
                        JOptionPane.showMessageDialog(null,
                                "Produkti u mor me sukses, ju keni harxhuar 480 pike, ju kane mbetur dhe 920 pike");
                    }
                    if (pik1 == 3) {
                        JOptionPane.showMessageDialog(null,
                                "Produkti u mor me sukses, ju keni harxhuar 700 pike, ju kane mbetur dhe 700 pike");
                    }
                    boolean c = pik1 >= 4;
                    if (c) {
                        JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                    }
                    if (zgjedhja == 2) {
                        JOptionPane.showMessageDialog(null, "Blerja juaj u krye me sukses! Ju keni fituar 3240 pike");
                        JOptionPane.showMessageDialog(null,
                                "Produktet qe ju mund te merrni falas duke mbledhur pike jane :"
                                        + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                        + "\n65% Keyboard (code 3) (700 pike)");
                        String piket2 = JOptionPane.showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                        double pik2 = (int) Double.parseDouble(piket2);
                        if (pik2 == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Produkti u mor me sukses, ju keni harxhuar 300 pike, ju kane mbetur dhe 2940 pike");
                        }
                        if (pik2 == 2) {
                            JOptionPane.showMessageDialog(null,
                                    "Produkti u mor me sukses, ju keni harxhuar 480 pike, ju kane mbetur dhe 2760 pike");
                        }
                        if (pik2 == 3) {
                            JOptionPane.showMessageDialog(null,
                                    "Produkti u mor me sukses, ju keni harxhuar 700 pike, ju kane mbetur dhe 2540 pike");
                        }
                        if (c) {
                            JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                        }
                        if (zgjedhja == 2) {
                            JOptionPane.showMessageDialog(null,
                                    "Blerja juaj u krye me sukses! Ju keni fituar 560 pike");
                            JOptionPane.showMessageDialog(null,
                                    "Produktet qe ju mund te merrni falas duke mbledhur pike jane :"
                                            + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                            + "\n65% Keyboard (code 3) (700 pike)");
                            String piket3 = JOptionPane
                                    .showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                            double pik3 = (int) Double.parseDouble(piket3);
                            if (pik3 == 1) {
                                JOptionPane.showMessageDialog(null,
                                        "Produkti u mor me sukses, ju keni harxhuar 300 pike, ju kane mbetur dhe 180 pike");
                            }
                            if (pik3 == 2) {
                                JOptionPane.showMessageDialog(null,
                                        "Produkti u mor me sukses, ju keni harxhuar 480 pike, ju kane mbetur dhe 80 pike");
                            }
                            if (pik3 == 3) {
                                JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                            }
                            if (c) {
                                JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                            }
                        }
                    }

                }

            }
        }
        // Profili nr 3
        if (nr == 3) {
            String pini = JOptionPane.showInputDialog("Jepni pinin tuaj");
            double pin = (int) Double.parseDouble(pini);
            if (pin == 123123) {
                JOptionPane.showMessageDialog(null, "Produktet jane:" + "\nTV (code 1) (1400 pike)"
                        + "\nRouter (code 2) (520 pike)" + "\nScreen (code 3) (260 pike)");
                String produktet = JOptionPane.showInputDialog(null, "Jepni produktet qe do te merrni :");
                double zgjedhja = (int) Double.parseDouble(produktet);
                if (zgjedhja == 1) {
                    JOptionPane.showMessageDialog(null, "Blerja juaj u krye me sukses! Ju keni fituar 1400 pike");
                    JOptionPane.showMessageDialog(null,
                            "Produktet qe ju mund te merrni falas duke mbledhur pike jane  :"
                                    + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                    + "\n65% Keyboard (code 3) (700 pike)");
                    String piket1 = JOptionPane.showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                    double pik1 = (int) Double.parseDouble(piket1);
                    if (pik1 == 1) {
                        JOptionPane.showMessageDialog(null,
                                "Produkti u mor me sukses, ju keni harxhuar 300 pike, ju kane mbetur dhe 1100 pike");
                    }
                    if (pik1 == 2) {
                        JOptionPane.showMessageDialog(null,
                                "Produkti u mor me sukses, ju keni harxhuar 480 pike, ju kane mbetur dhe 920 pike");
                    }
                    if (pik1 == 3) {
                        JOptionPane.showMessageDialog(null,
                                "Produkti u mor me sukses, ju keni harxhuar 700 pike, ju kane mbetur dhe 700 pike");
                    }
                    boolean c = pik1 >= 4;
                    if (c) {
                        JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                    }
                    if (zgjedhja == 2) {
                        JOptionPane.showMessageDialog(null, "Blerja juaj u krye me sukses! Ju keni fituar 520 pike");
                        JOptionPane.showMessageDialog(null,
                                "Produktet qe ju mund te merrni falas duke mbledhur pike jane :"
                                        + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                        + "\n65% Keyboard (code 3) (700 pike)");
                        String piket2 = JOptionPane.showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                        double pik2 = (int) Double.parseDouble(piket2);
                        if (pik2 == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Produkti u mor me sukses, ju keni harxhuar 300 pike, ju kane mbetur dhe 220 pike");
                        }
                        if (pik2 == 2) {
                            JOptionPane.showMessageDialog(null,
                                    "Produkti u mor me sukses, ju keni harxhuar 480 pike, ju kane mbetur dhe 120 pike");
                        }
                        if (pik2 == 3) {
                            JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                        }
                        if (c) {
                            JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                        }
                        if (zgjedhja == 2) {
                            JOptionPane.showMessageDialog(null,
                                    "Blerja juaj u krye me sukses! Ju keni fituar 260 pike");
                            JOptionPane.showMessageDialog(null,
                                    "Produktet qe ju mund te merrni falas duke mbledhur pike jane :"
                                            + "\nMouse Pad, (code 1) (300 pike)" + "\nMouse (code 2) (480 pike)"
                                            + "\n65% Keyboard (code 3) (700 pike)");
                            String piket3 = JOptionPane
                                    .showInputDialog("Vendosni kodin per produktin qe doni te merrni :");
                            double pik3 = (int) Double.parseDouble(piket3);
                            if (pik3 == 1) {
                                JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                            }
                            if (pik3 == 2) {
                                JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                            }
                            if (pik3 == 3) {
                                JOptionPane.showMessageDialog(null, "Ju keni nuk keni pike te mjaftueshme");
                            }
                            if (c) {
                                JOptionPane.showMessageDialog(null, "Produkti nuk ekziston");
                            }
                        }
                    }
                }
            }
        }
    }
}