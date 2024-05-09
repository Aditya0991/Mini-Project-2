lr=int(input("enter the lenght of room: "))
br=int(input("enter the breath of room: "))
lt=int(input("enter the length of tile: "))
bt=int(input("enter the breath of tile: "))
area_room=lr*br
area_tile=lt*bt
req_tile=area_room//area_tile
print(f"Required tile for room are {req_tile}")